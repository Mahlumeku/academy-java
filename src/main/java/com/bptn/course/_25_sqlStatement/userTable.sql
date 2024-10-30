
-- Create the "User" table
  CREATE TABLE "user"( 
  "userId" INT GENERATED ALWAYS AS IDENTITY,
  "firstName" VARCHAR(120) NOT NULL,
  "lastName" VARCHAR(120) NOT NULL,
  "userName" VARCHAR(120) NOT NULL,
  "phone" VARCHAR(100) NOT NULL,
  "emailId" VARCHAR(100) NOT NULL,
  "password" VARCHAR(100) NOT NULL,
  "emailVerified" BOOLEAN NOT NULL DEFAULT FALSE,
  "createdOn" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

  CONSTRAINT User_pkey PRIMARY KEY ("userId"),
  CONSTRAINT User_emailId_key UNIQUE ("emailId"),
  CONSTRAINT User_userName_key UNIQUE ("userName")
 );
-- 
-- Insert a new row into the "User" table

INSERT INTO "user"("firstName","lastName","userName","phone","emailId","password","emailVerified") VALUES
 ('Jessie','Doe', 'jessiedoe','+1-555-1234','jessiedoe@example.com','password123','true');
 
-- Select all rows from the "User" table

SELECT * FROM "user";

-- Insert multiple users with a single insert statement using a VALUES list
 INSERT INTO "user"("firstName","lastName","userName","phone","emailId", "password","emailVerified") VALUES
('Amy', 'Lee', 'amylee', '+1-555-9012', 'amylee@example.com', 'password789', 'true' ),
('Tom', 'Jones', 'tomjones', '+1-555-3456', 'tomjones@example.com', 'passwordabc','false'),
('Diana', 'Hill', 'dianahill', '+1-632-3456', 'dianahill@example.com', 'password123','false');

-- Select all rows from the "User" table where the value of the "emailVerified" column is true

SELECT * FROM "user" WHERE "emailVerified" = 'TRUE';

-- Insert a few more users into the "User" table, (at least four more)
INSERT INTO "user"("firstName","lastName","userName","phone","emailId", "password","emailVerified") VALUES
('John', 'Doe', 'johndoe', '123-456-7890', 'john@example.com', 'password012', 'TRUE'),
('Jane', 'Smith', 'janesmith', '222-999-999', 'jane@example.com', 'pass456', 'FALSE'),
('Tom', 'Smith', 'tomsmith', '555-555-5555', 'toms@example.com', 'securepass', 'TRUE'),
('Alice', 'Brown', 'alicebrown', '777-222-3333', 'alice@example.com', 'alicepass', 'FALSE');

-- Update user with username "tomjones"

UPDATE "user" SET "userName" = 'randyjones' WHERE "userName" = 'tomjones';

-- Select user with username "tomjones"

SELECT * FROM "user" WHERE "userName" = 'randyjones';

-- Delete user with username "randyjones"

DELETE FROM "user" WHERE "userName" = 'randyjones';

-- Select all rows from the "User" table

SELECT * FROM "user";