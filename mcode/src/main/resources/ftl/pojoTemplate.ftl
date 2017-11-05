package ${packageName}.${proName}.model.${modelName};

public class ${objectName} {
	
	private ${pkIdType} ${pkIdName};
	<#list fieldList as var>
	private ${var.colType} ${var.name};
	</#list>
	
	public ${pkIdType} get${pkIdUname}(){
		return ${pkIdName};
	}
	
	public void set${pkIdUname}(${pkIdType} ${pkIdName}){
		this.${pkIdName} = ${pkIdName};
	}
	
	<#list fieldList as var>
	public ${var.colType} get${var.uname}(){
		return ${var.name};
	}
	
	public void set${var.uname}(${var.colType} ${var.name}){
		this.${var.name} = ${var.name};
	}
	</#list>
}
