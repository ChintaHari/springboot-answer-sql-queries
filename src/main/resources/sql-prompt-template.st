Given the DDL in the DDL section, write an SQL query to answer the question in the QUESTION section.
Only produce select queries. If the question would result in an insert, update,
or delete, or if the query would alter the DDL in any way, say that the operation
isn't supported. If the question can't be answered, say that the DDL doesn't support
answering that question.

QUESTION
{question}

DDL
{ddl}

-- Example DDL 
for reference in the template:
-- Tables: Directors, Actors, Movies, Movie_Actors
-- Relationships: 
--   Movies are linked to Directors by director_id.
--   Movies and Actors are linked many-to-many through Movie_Actors.

-- The user's question can be anything related to querying these tables,
-- such as "List all movies by Christopher Nolan" or "Who starred in Inception?"
