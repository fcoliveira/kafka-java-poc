CREATE DATABASE events;

\c events;

CREATE TABLE "event"(
    "uuid" UUID PRIMARY KEY,
    "ingress_time" NOT NULL TIMESTAMP WITH TIME ZONE,
    "payload" JSON,
    "metadata" JSON
);