INSERT INTO users
(id, email, hash_password, state, role)
  SELECT
    1,
    'admin@admin.com',
    '$2a$04$trEtLZ7QLz5YAEdyFv8BaOxezlJC8IjrwAnaKT0rDWfrBzCud0ghm',
    'CONFIRMED',
    'ADMIN'
  WHERE
    NOT EXISTS(
        SELECT id
        FROM users
        WHERE id = 1
    );

CREATE TABLE IF NOT EXISTS persistent_logins(
  username VARCHAR(64) NOT NULL,
  series VARCHAR(64) PRIMARY KEY NOT NULL,
  token VARCHAR(64) NOT NULL,
  last_used TIMESTAMP NOT NULL
)