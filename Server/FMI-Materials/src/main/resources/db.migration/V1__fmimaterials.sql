USE fmimaterials;

CREATE TABLE user
(
    id         int         NOT NULL PRIMARY KEY,
    fullname   VARCHAR(80) NOT NULL,
    email      VARCHAR(80) NOT NULL,
    passwd     VARCHAR(80) NOT NULL,
    materialid VARCHAR(36) NOT NULL UNIQUE KEY
);


CREATE TABLE course
(
    id         int         NOT NULL PRIMARY KEY,
    fullname   VARCHAR(80) NOT NULL,
    materialid VARCHAR(36) NOT NULL UNIQUE KEY
);

CREATE TABLE material
(
    id            int         NOT NULL PRIMARY KEY,
    fullname      VARCHAR(80) NOT NULL,
    users         VARCHAR(36) NOT NULL UNIQUE KEY,
    material_type VARCHAR(80) NOT NULL UNIQUE KEY,
    courses       VARCHAR(36) NOT NULL UNIQUE KEY
);

CREATE TABLE group
(
    id      int         NOT NULL PRIMARY KEY,
    courses VARCHAR(36) NOT NULL UNIQUE KEY
);

CREATE TABLE material_type
(
    id       int         NOT NULL PRIMARY KEY,
    fullname VARCHAR(80) NOT NULL,
    courses  VARCHAR(36) NOT NULL UNIQUE KEY
);