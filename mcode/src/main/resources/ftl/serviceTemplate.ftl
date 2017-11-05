package ${packageName}.${proName}.service.${modelName};

import ${packageName}.util.Prb;
import ${packageName}.util.Psb;
import ${packageName}.${proName}.model.${modelName}.${objectName};

/**
 * @class ${objectName}Service.java
 * @author billz
 * @date ${nowDate}
 */
public interface ${objectName}Service {
	 
	 /**
	 * 分页查询
	 * @param psb
	 * @return
	 */
	Prb<${objectName}> findPageList(Psb<${objectName}> psb);
	
	int updateBy${pkIdUname}(${objectName} ${objectNameFirstCharLower});
	
	int insert(${objectName} ${objectNameFirstCharLower});
	
	int delBy${pkIdUname}(${pkIdType} ${pkIdName});
	
	${objectName} findBy${pkIdUname}(${pkIdType} ${pkIdName});
}