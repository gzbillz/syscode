<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${packageName}.${proName}.dao.${modelName}.${objectName}Mapper">
	<resultMap id="BaseResultMap" type="${packageName}.${proName}.model.${modelName}.${objectName}">
		<id property="${pkIdName}" column="${pkIdColName}" jdbcType="${pkIdJtype}" />
	  <#list fieldList as var> 
		<result property="${var.name}" column="${var.colName}" jdbcType="${var.jdbcType}" />
	  </#list>
	</resultMap>
	<sql id="Base_Column_List">
		${pkIdColName}<#list fieldList as var>,${var.colName}</#list>
	</sql>
	<sql id="Tb_table_name">${tableName}</sql>
	
	<select id="findPageCount" parameterType="psb" resultType="Integer">
		select count(1) from <include refid="Tb_table_name" />
		<trim prefix="WHERE" prefixOverrides="AND |OR ">
			<#list fieldList as var>
			<if test="bean.${var.name} != null and bean.${var.name} != '' ">
				and ${var.colName} = ${r"#{bean."}${var.name}${r"}"}
			</if>
			</#list>
		</trim>
	</select>
	
	<select id="findPageList" parameterType="psb" resultMap="BaseResultMap">
		select
			<include refid="Base_Column_List" />
		from <include refid="Tb_table_name" /> 
		<trim prefix="WHERE" prefixOverrides="AND |OR ">
			<#list fieldList as var>
			<if test="bean.${var.name} != null and bean.${var.name} != '' ">
				and ${var.colName} = ${r"#{bean."}${var.name}${r"}"}
			</if>
			</#list>
		</trim>
		order by ${pkIdColName} desc
		limit ${r"#{"}start${r"}"},${r"#{"}end${r"}"}
	</select>
	
	<select id="findBy${pkIdUname}" parameterType="${pkIdType}" resultMap="BaseResultMap">
		select
			<include refid="Base_Column_List" />
		from 
			<include refid="Tb_table_name" />
		where ${pkIdColName} = ${r"#{"}${pkIdName}${r"}"}
	</select>
	
	<delete id="delBy${pkIdUname}" parameterType="${pkIdType}">
		delete from <include refid="Tb_table_name" />
		where ${pkIdColName} = ${r"#{"}${pkIdName}${r"}"}
	</delete>
	
	<insert id="insert" parameterType="${packageName}.${proName}.model.${modelName}.${objectName}" useGeneratedKeys="true"
		keyProperty="${pkIdColName}">
		insert into <include refid="Tb_table_name" />
		<trim prefix="(" suffix=")" suffixOverrides=",">
			<if test="${pkIdColName} != null">
				${pkIdColName},
			</if>
			<#list fieldList as var>
			<if test="${var.name} != null">
				${var.colName},
			</if>
			</#list>
		</trim>
		<trim prefix="values (" suffix=")" suffixOverrides=",">
			<if test="${pkIdColName} != null">
				${r"#{"}${pkIdName}${r"}"},
			</if>
			<#list fieldList as var>
			<if test="${var.colName} != null">
				${r"#{"}${var.colName}${r"}"},
			</if>
			</#list>
		</trim>
	</insert>
	
	<update id="updateBy${pkIdUname}" parameterType="${packageName}.${proName}.model.${modelName}.${objectName}">
		update <include refid="Tb_table_name" />
		<trim suffixOverrides=",">
			<set> 
				<#list fieldList as var>
				<if test="${var.colName} != null ">
					${var.colName} = ${r"#{"}${var.colName}${r"}"},
				</if>
				</#list>
			</set>
		</trim>
		where ${pkIdColName} = ${r"#{"}${pkIdName}${r"}"}
	</update>
</mapper>