drop table if exists tb_demo;

/*==============================================================*/
/* Table: tb_demo                                               */
/*==============================================================*/
create table tb_demo
(
  id                   bigint unsigned not null comment '主键id',
  demo_name            varchar(16) not null default '' comment 'demo名称',
  demo_value           varchar(16) not null default '' comment 'demo值',
  demo_status          tinyint unsigned not null default 1 comment 'demo状态：1=正常，0=屏蔽',
  create_time          datetime not null default CURRENT_TIMESTAMP comment '创建时间',
  update_time            datetime not null default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '修改时间',
  primary key (id)
);

alter table tb_demo comment 'demo表';
