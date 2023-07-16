CREATE TABLE survey (
  id             SERIAL PRIMARY KEY ,
  name           VARCHAR(64) NOT NULL,
  description    VARCHAR(512) NOT NULL,
  uuid           CHAR(36) NOT NULL,
  is_active       BOOLEAN  NOT NULL,
  created_at      DATE NOT NULL
);

CREATE TABLE question (
  id             SERIAL PRIMARY KEY,
  description    VARCHAR(512) NOT NULL,
  created_at      DATE NOT NULL,
  survey_id       BIGINT NOT NULL,
  CONSTRAINT fk_survey
      FOREIGN KEY(survey_id)
  	  REFERENCES survey(id)
);

CREATE TABLE answer (
  id             SERIAL PRIMARY KEY,
  description    VARCHAR(512) NOT NULL,
  created_at      DATE NOT NULL,
  question_id       BIGINT NOT NULL,
  CONSTRAINT fk_question
      FOREIGN KEY(question_id)
  	  REFERENCES question(id)
);
