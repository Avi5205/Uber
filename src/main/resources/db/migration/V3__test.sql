ALTER TABLE booking
    DROP
        FOREIGN KEY FK_BOOKING_ON_REVIEW;

ALTER TABLE booking
    ADD reviews_id BIGINT NULL;

ALTER TABLE booking
    ADD CONSTRAINT uc_booking_reviews UNIQUE (reviews_id);

ALTER TABLE booking
    ADD CONSTRAINT FK_BOOKING_ON_REVIEWS FOREIGN KEY (reviews_id) REFERENCES booking_review (id);

ALTER TABLE booking
    DROP
        COLUMN review_id;
