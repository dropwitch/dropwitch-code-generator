# dropwitch-code-generator

dropwitch-code-generator is a __Java code generator__.

- Reverse engineering existing MySQL tables
- Generate MySQL Schema, Entity and DAO

This generator is powered by [Python Fabric](http://www.fabfile.org/)


## Dependencies

- MySQL client 5.6 (mysql command)
- Python 2.7
- fabric
- jinja2 (Python template module)


## Usage

Edit `env` in fabfile/\__init\__.py:

```
env.mysql_user = "your_mysql_user_name"
env.mysql_database = "your_database_name"

env.schema_sql_dir = "src/main/resources/db/"
env.entity_dir = "src/main/java/path/to/entity"
env.entity_dao_base_dir = "src/main/java/path/to/entity/dao/base"
env.java_package_entity = "path.to.entity"
env.java_package_entity_dao_base = "path.to.entity.dao.base"
```

Create tables (migrate database):

```
# Run your DB migration tool (Flyway, Liquibase, etc.)
# or execute DDL (something like CREATE TABLE queries)
```

Run schema file generator:

```
cd /path/to/workspace/dropwitch-code-generator
fab generate.schema
# after this, enter mysql password
```

Run entity file generator:

```
cd /path/to/workspace/dropwitch-code-generator
fab generate.entities
```
