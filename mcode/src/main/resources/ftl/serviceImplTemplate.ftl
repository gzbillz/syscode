package ${packageName}.${proName}.service.${modelName}.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${packageName}.util.Prb;
import ${packageName}.util.Psb;
import ${packageName}.${proName}.dao.${modelName}.${objectName}Mapper;
import ${packageName}.${proName}.model.${modelName}.${objectName};
import ${packageName}.${proName}.service.${modelName}.${objectName}Service;

/**
 * @class ${objectName}ServiceImpl.java
 * @author billz
 * @date ${nowDate}
 */
@Service
public class ${objectName}ServiceImpl implements ${objectName}Service {

	@Autowired
	private ${objectName}Mapper mapper;
	
	@Override
	public Prb<${objectName}> findPageList(Psb<${objectName}> psb){
		return new Prb<${objectName}>(mapper.findPageList(psb), mapper.findPageCount(psb));
	}
	
	@Override
	public int updateBy${pkIdUname}(${objectName} ${objectNameFirstCharLower}){
		return mapper.updateBy${pkIdUname}(${objectNameFirstCharLower});
	}
	
	@Override
	public int insert(${objectName} ${objectNameFirstCharLower}){
		return mapper.insert(${objectNameFirstCharLower});
	}
	
	@Override
	public int delBy${pkIdUname}(${pkIdType} ${pkIdName}){
		return mapper.delBy${pkIdUname}(${pkIdName});
	}
	
	@Override
	public ${objectName} findBy${pkIdUname}(${pkIdType} ${pkIdName}){
		return mapper.findBy${pkIdUname}(${pkIdName});
	}
}