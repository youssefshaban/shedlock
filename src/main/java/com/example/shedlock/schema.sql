CREATE TABLE SHEDLOCK (
    name VARCHAR(64),
    lock_until TIMESTAMP(3) NULL,
    locked_at TIMESTAMP(3) NULL,
    locked_by VARCHAR(255),
    PRIMARY KEY (name)
);


INSERT INTO shedlock(name, lock_until, locked_at, locked_by) VALUES('a', TIMESTAMPADD(MICROSECOND, 10, CURRENT_TIMESTAMP(3)), CURRENT_TIMESTAMP(3), 'youssef')