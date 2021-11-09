CREATE TABLE petani
(
    id     int NOT NULL AUTO_INCREMENT,
    nama   varchar(100),
    code   varchar(100),
    alamat varchar(100),
    noKtp  varchar(100),
    noTelp varchar(100),
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;