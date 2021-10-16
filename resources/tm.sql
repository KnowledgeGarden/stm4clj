-- sketch of what it needs
-- Datahike already uses a k-v datastore schema

CREATE TABLE IF NOT EXISTS
tuple (
  entity    text UNIQUE,
  reln      text NOT NULL,
  val       text NOT NULL,
  txid      timestamp NOT NULL,
  "added"      boolean DEFAULT true,
  PRIMARY KEY (lox, reln, val)
);

-- GRANT ALL PRIVILEGES ON tuple TO ??;

CREATE INDEX IF NOT EXISTS tuple_idx
  ON tuple (entity, reln, val);

