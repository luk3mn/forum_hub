-- Change the column type of profiles_id to varchar(200)
ALTER TABLE users
RENAME COLUMN profiles_id TO profiles;