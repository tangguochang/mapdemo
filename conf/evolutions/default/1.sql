# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table map_point (
  id                        bigint not null,
  label                     varchar(255),
  longitude                 varchar(255),
  latitude                  varchar(255),
  info                      varchar(255),
  constraint pk_map_point primary key (id))
;

create table task (
  id                        bigint not null,
  label                     varchar(255),
  constraint pk_task primary key (id))
;

create sequence map_point_seq;

create sequence task_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists map_point;

drop table if exists task;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists map_point_seq;

drop sequence if exists task_seq;

