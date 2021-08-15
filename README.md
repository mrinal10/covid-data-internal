# marketplace-adapter

## TODO

Welcome to your Marketplace-Adapter service.

## Introduction

* Team: Neptunite
* Slack: #sapis-neptunite
* Swagger: [here](https://marketplace-adapter.rest.wip.internal.tide.co/tide-backend/rest/api/swagger-ui.html)
* [Backlog](https://tideaccount.atlassian.net/secure/RapidBoard.jspa?rapidView=518&view=planning&issueLimit=100)
* [Confluence](https://tideaccount.atlassian.net/wiki/spaces/TBE/pages/2956329159/Marketplace+Adapter)

This service offers various apis for tide members to communicate with cocorico platform to fetch relevant information
such as profiles, chat, bookings etc.

## Requirements

| Framework                                                                | Version       |
|--------------------------------------------------------------------------|---------------|
| Gradle Wrapper                                                           | 6.8.1         |
| Java                                                                     | 11            |
| Spring Boot                                                              | 2.4.4         |
| jOOQ                                                                     | 3.14.4        |
| PostgreSql                                                               | 11.6          |
| [tide-jwt-security](https://bitbucket.org/tideaccount/tide-jwt-security) | 3.1.0         |

## Events & Commands Produced

None.

## Events & Commands Consumed

None.

## Synchronous APIs Provided

TODO: What endpoints do you offer in this service? REST or gRPC? Perhaps a high-level view, with a link to your Swagger
docs? Do not remove this section if you do not provide synchronous APIs.

## Internal Dependencies

None.

## Scheduled Tasks

None.

## Databases and Local Projections

This service has its own postgres database.

## Third Parties & External Dependencies

Maketplace-adapter service is dependent on cocorico platform. Swagger details: https://tide.coco.cloud/api/v1/doc

## Project structure

    .
    ├── bin                         : Shell scripts for installing, running and building.
    ├── bitbucket-pipelines.yml     : Bitbucket Pipelines definition.
    ├── build.gradle                : Gradle build script.
    ├── docker                      : Docker-related files for testing, building and deploying the service.
    │   ├── main                    : Production Docker files.
    │   └── test                    : Test Docker files.
    ├── gradle                      : Gradle wrapper.
    ├── gradle.properties           : Local properties for Gradle.
    ├── gradlew                     : Gradle Wrapper script (Unix).
    ├── libraries.gradle            : Contains all the dependencies versions.
    ├── lombok.config               : Required to exclude Lombok generated code from Sonarcloud coverage reports.
    ├── README.md                   : This file you are reading right now ;).
    ├── settings.gradle             : Project's Gradle settings.
    ├── sql                         : General database scripts for starting a test database.
    └── src                         : Sources.
        ├── generated-db-entities   : Sources for generated database entities.
        ├── main                    : Main sources.
        └── test                    : Test sources.

# Installation instructions for Java

    NOTE: Always prefer to install Java through your package manager. Use this section only if your system
    does not offer packages for Java 11 yet.

With Java releasing every six months, it's likely that distributions don't keep up. We can however install several JDKs
on se same machine. Just make sure you're using the correct one for each project.

## Opening the project in an IDE (for IntelliJ only)

Before opening the project, go to `File -> Project Structure` and add a Java 11 compatible JDK.

When opening the project with IntelliJ, make sure that the Gradle JVM option in the "Open dialog" points to the correct
Java 11 JDK. Finally, set the project SDK and source level correctly for Java 11 in `File -> Project Structure`.

For the project to build properly in IntelliJ you also need to enable annotation processing from:
Settings -> Build, Executions, Deployment -> Compiler -> Annotation Processors

# Building

For running on a terminal, make sure you use the right Java VM (Java 11 or above). You might need to define
`JAVA_HOME` before building with Gradle Wrapper:

    $ export JAVA_HOME=/opt/java/java-11
    $ ./gradlew test clean build -x test

Or

    $ JAVA_HOME=/opt/java/java-11 ./gradlew clean build -x test

Or you may pass the Java home directory directly to the Gradle Wrapper:

    $ ./gradlew -Dorg.gradle.java.home=/opt/java/java-11 clean build -x test

# AWS for Development

In `src/test/resources/cloud` there are files such as `s3` and `sqs`, you run:

    $ ./start-local-cloud-services.sh

Each line-entry in the above files, will create a resource of the given name for use locally. The Timeline Service will
automatically attempt to use these local resource when running in the spring profile 'dev', all that you are required to
do is make sure that the entries in application-dev.properties correspond to the resource names.

e.g. an entry in s3 of `test-timeline-bucket` will create an S3 resource named this, all you have to do is make sure
this is the bucket name that the timeline is trying to connect to.

# Testing locally

For testing locally, a database is needed. To create a database container, just run:

    $ cd bin
    $ ./start-test-db.sh

Then run the tests the usual way with the Gradle wrapper.

# Database entities

For accessing the database we use Jooq in this project. Jooq generates the entities automatically from the DB schema.
The generation can be triggered as follows:

    $ cd bin
    $ ./start-test-db.sh
    $ cd ..
    $ JAVA_HOME=/opt/java/java-11 ./gradlew clean bootRun -Dspring.profiles.active=dev

    Hit Ctrl-C after the migrations have run and the service has started.

    $ ./gradlew jooqGen

This will start a fresh DB, run the service (which will run the Liquibase migrations) and finally generate the sources.
If the DB schema is already up-to-date, you don't need to run the service (i.e. the migrations).