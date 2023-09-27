package com.entity.vo;

import com.entity.QinshuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 亲属
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-02 17:48:05
 */
public class QinshuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 亲属姓名
	 */
	
	private String qinshuxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 与老人关系
	 */
	
	private String yulaorenguanxi;
				
	
	/**
	 * 设置：亲属姓名
	 */
	 
	public void setQinshuxingming(String qinshuxingming) {
		this.qinshuxingming = qinshuxingming;
	}
	
	/**
	 * 获取：亲属姓名
	 */
	public String getQinshuxingming() {
		return qinshuxingming;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：与老人关系
	 */
	 
	public void setYulaorenguanxi(String yulaorenguanxi) {
		this.yulaorenguanxi = yulaorenguanxi;
	}
	
	/**
	 * 获取：与老人关系
	 */
	public String getYulaorenguanxi() {
		return yulaorenguanxi;
	}
			
}
