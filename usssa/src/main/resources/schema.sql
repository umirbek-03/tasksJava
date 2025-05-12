CREATE TABLE person (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    age INT-- можно добавить и другие поля
);

CREATE TABLE phone (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    number VARCHAR(255),
    person_id BIGINT,
    CONSTRAINT fk_person FOREIGN KEY (person_id) REFERENCES person(id)
);
