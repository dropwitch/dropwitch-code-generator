#coding:utf-8
from fabric.api import env

import generate

env.mysql_user = "root"
env.mysql_database = "dropwitch"

env.schema_sql_dir = "example_src/main/resources/db/"
env.entity_dir = "example_src/main/java/com/github/dropwitch/entity"
env.entity_dao_base_dir = "example_src/main/java/com/github/dropwitch/entity/dao/base"
env.java_package_entity = "com.github.dropwitch.entity"
env.java_package_entity_dao_base = "com.github.dropwitch.entity.dao.base"
