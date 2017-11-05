package ${packageName}.xyang.controller.${modelName};

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.billz.framework.controller.BaseController;
import com.billz.framework.util.Constant;
import com.billz.framework.util.PageBean;
import com.billz.framework.util.ParamUtils;
import ${packageName}.${proName}.model.${modelName}.${objectName};
import ${packageName}.${proName}.service.${modelName}.${objectName}Service;
import com.billz.util.Prb;
import com.billz.util.Psb;

/** 
 * @class ${objectName}Controller
 * @author billz
 * @date 2017年6月22日
 */
@Controller
@RequestMapping(value="/${modelName}/${objectNameFirstCharLower}")
public class ${objectName}Controller extends BaseController {
	
	final Logger logger = LoggerFactory.getLogger(${objectName}Controller.class);
	
	@Autowired
	private ${objectName}Service ${objectNameFirstCharLower}Service; 
	
	// 分页
	@RequestMapping(value = "/list")
	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("xyang/${modelName}/${objectNameFirstCharLower}/${objectNameFirstCharLower}_list");
		/**分页条件获取start**/
		int curPage = Integer.valueOf(ParamUtils.getParameter(request, "pageBean.curPage", "1"));
		int pageSize = Integer.valueOf(ParamUtils.getParameter(request, "pageBean.pageSize", ""+Constant.LIST_PAGE_SIZE));//每页多少条
 		// 使用SQL语句直接分页查询时使用start和end
		int start = (curPage - 1) * pageSize;
		int end = start + pageSize;
		/**分页条件获取end**/
		
 		${objectName} ${objectNameFirstCharLower} = new ${objectName}();
		getRequestParams(request, ${objectNameFirstCharLower});
		Prb<${objectName}> prb = ${objectNameFirstCharLower}Service.findPageList(new Psb<${objectName}>(start, end, ${objectNameFirstCharLower})); 
 		model.addObject("pageBean", new PageBean(curPage, pageSize, prb.getCount()));
		model.addObject("data", prb.getData());
		model.addObject("${objectNameFirstCharLower}", ${objectNameFirstCharLower});
		return model;
	}
	
	// 查询详细信息
	@RequestMapping(value = "/findBy${pkIdUname}")
	public ModelAndView detail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mvc = new ModelAndView("xyang/${modelName}/${objectNameFirstCharLower}/${objectNameFirstCharLower}_add");
		String ${pkIdName} = request.getParameter("${pkIdName}");
 		if(!StringUtils.isEmpty(${pkIdName})){
 			${objectName} ${objectNameFirstCharLower} = ${objectNameFirstCharLower}Service.findBy${pkIdUname}(${pkIdType}.valueOf(${pkIdName}));		
			mvc.addObject("${objectNameFirstCharLower}", ${objectNameFirstCharLower});
		}
		return mvc;
	}
	
	// 新增页面
	@RequestMapping(value = "/add")
	public ModelAndView addView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return new ModelAndView("xyang/${modelName}/${objectNameFirstCharLower}/${objectNameFirstCharLower}_add");
	}
	
	// 保存
	@RequestMapping(value = "/save")
	public ModelAndView save(HttpServletRequest request, HttpServletResponse response) throws Exception {
		${objectName} ${objectNameFirstCharLower} = new ${objectName}();
		getRequestParams(request, ${objectNameFirstCharLower});
		int rec = ${objectNameFirstCharLower}Service.insert(${objectNameFirstCharLower});
		logger.info("保存结果：" + rec);
		return new ModelAndView("redirect:/${modelName}/${objectNameFirstCharLower}/list.do");
	}
	
	// 修改
	@RequestMapping(value = "/edit")
	public ModelAndView edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		${objectName} ${objectNameFirstCharLower} = new ${objectName}();
		String ${pkIdName} = request.getParameter("${pkIdName}");
		if(!StringUtils.isEmpty(${pkIdName})){
			getRequestParams(request, ${objectNameFirstCharLower});
			int rec = ${objectNameFirstCharLower}Service.updateBy${pkIdUname}(${objectNameFirstCharLower});
			logger.info("修改结果：" + rec);
		} else {
			logger.error("修改数据，数据主键不存在，修改失败!");	
		}
		return new ModelAndView("redirect:/${modelName}/${objectNameFirstCharLower}/list.do");
	}
	
	// 删除
	@RequestMapping(value = "/del")
	public ModelAndView del(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ${pkIdName} = request.getParameter("${pkIdName}"); 
		if(!StringUtils.isEmpty(${pkIdName})){
			${objectNameFirstCharLower}Service.delBy${pkIdUname}(${pkIdType}.valueOf(${pkIdName}));
		} else {
			logger.error("删除数据，数据主键不存在，删除失败!");			
		} 
		return new ModelAndView("redirect:/${modelName}/${objectNameFirstCharLower}/list.do");
	}

	private void getRequestParams(HttpServletRequest request, ${objectName} ${objectNameFirstCharLower}){
		String tmp = request.getParameter("${pkIdName}");
		if(!StringUtils.isEmpty(tmp)){
			${objectNameFirstCharLower}.set${pkIdUname}(${pkIdType}.valueOf(tmp));
		}
		<#list fieldList as var>
		tmp = request.getParameter("${var.name}");
		if(!StringUtils.isEmpty(tmp)){
			${objectNameFirstCharLower}.set${var.uname}(tmp);
		}
		</#list>
	}
}
