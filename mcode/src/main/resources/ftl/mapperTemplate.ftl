package ${packageName}.${proName}.dao.${modelName};

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.billz.util.Psb;
import ${packageName}.${proName}.model.${modelName}.${objectName};

/**
 * @class ${objectName}Mapper.java
 * @author billz
 * @date ${nowDate}
 */
@Repository
public interface ${objectName}Mapper {

	int findPageCount(Psb<${objectName}> ${objectNameFirstCharLower});
	
	List<${objectName}> findPageList(Psb<${objectName}> ${objectNameFirstCharLower});
	
	${objectName} findBy${pkIdUname}(@Param("${pkIdName}") ${pkIdType} ${pkIdName});
	
	int delBy${pkIdUname}(@Param("${pkIdName}") ${pkIdType} ${pkIdName});

	int updateBy${pkIdUname}(${objectName} ${objectNameFirstCharLower});
	
	int insert(${objectName} ${objectNameFirstCharLower});
}

