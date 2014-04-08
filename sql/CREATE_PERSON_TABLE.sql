-- Table: person

-- DROP TABLE person;

CREATE TABLE person
(
  first_name character varying(20) NOT NULL,
  last_name character varying(20) NOT NULL,
  patronymic character varying(20) NOT NULL,
  birthday_date date NOT NULL,
  location_address character varying(40) NOT NULL,
  birth_address character varying(40),
  document_number character varying(20) NOT NULL,
  issuance_document_date date NOT NULL,
  expiration_document_date date NOT NULL,
  document_issued character varying(20) NOT NULL,
  CONSTRAINT person_pkey PRIMARY KEY (first_name, last_name)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE person
  OWNER TO postgres;
