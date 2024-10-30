Provide all the SQL statements you ran for these operations

-- Create the "Profile" table
  CREATE TABLE "profile"( 
  "profileId" INT GENERATED ALWAYS AS IDENTITY,
  "userId" INT NOT NULL,
  "headLine" VARCHAR(120) NOT NULL,
  "picture" VARCHAR(500) NOT NULL,
  "bio" VARCHAR(100) NOT NULL,
  "city" VARCHAR(100) NOT NULL,
  "country" VARCHAR(100) NOT NULL,
  
  CONSTRAINT Profile_pkey PRIMARY KEY ("profileId"),
  CONSTRAINT Profile_userId_fkey UNIQUE ("userId")
  
 );

-- Insert a new row into the "Profile" table

 INSERT INTO Profile ("userId", "headLine", "picture", "bio", "city", "country") VALUES
 ('2', 'Wondergirl Amy!','https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg',
 'My name is Amy and I am a super hero.','Toronto','Canada');


-- Select all rows from the "Profile" table

SELECT * FROM "profile";

-- Insert two new profiles with a single statement using a VALUES list. (use your won data)

INSERT INTO Profile ("userId", "headLine", "picture", "bio", "city", "country") VALUES
 ('3', 'Wondergirl Jessie!','https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg',
 'My name is Jessie and I am a super hero.','Toronto','Canada'),
  ('4', 'Wondergirl Diana!','https://static.vecteezy.com/system/resources/previews/005/162/430/original/cartoon-happy-superhero-girl-posing-free-vector.jpg',
 'My name is Diana and I am a super hero.','Toronto','Canada');

-- Select all rows from the "Profile" table where the country is "Canada".

SELECT * FROM "profile" WHERE "country" = 'Canada';

-- Update the profile with userId = 2

UPDATE "profile" SET "bio"='I am Amy and I probably shouldn''t tell anyone I''m a super hero' WHERE "userId"='2';

-- Delete profile with profileId = 3

DELETE FROM "profile" WHERE "profileId"='3';

-- Select all rows from the "Profile" table

SELECT * FROM "profile";

-- Select the row from the "Profile" table with userdId = 2

SELECT * FROM "profile" WHERE "userId"='2';

-- Join the "User" and "Profile" tables to get all the details for ALL users (including the ones without a profile). Hint: Use an outer join.

SELECT *, "user".*, "profile".* FROM "user" left join "profile" on "user"."userId" = "profile"."userId";

-- Join the "User" and "Profile" tables to get the details of the users who have a profile.

SELECT *, "user".*, "profile".* FROM "profile" left join "user" on "profile"."userId" = "user"."userId";


