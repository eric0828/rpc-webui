package com.linda.rpc.webui.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.linda.rpc.webui.pojo.ServiceConsumerInfo;

/**
 * @author AutoGenerated by lindzh
 * 2016年12月15日 16:55
 */
public interface ServiceConsumerInfoDao {

	public int addServiceConsumerInfo(ServiceConsumerInfo obj);

	public ServiceConsumerInfo getById(@Param("id")long id);
	
	public int updateById(@Param("obj")ServiceConsumerInfo obj);
	
	public int deleteById(@Param("id")long id);
	
	
	public List<ServiceConsumerInfo> getListByServiceId(@Param("serviceId")long serviceId,@Param("limit")int limit,@Param("offset") int offset);
	
	public long getCountByServiceId(@Param("serviceId")long serviceId);
	
	
	public List<ServiceConsumerInfo> getListByServiceAppId(@Param("serviceAppId")long serviceAppId,@Param("limit")int limit,@Param("offset") int offset);
	
	public long getCountByServiceAppId(@Param("serviceAppId")long serviceAppId);
	
	
	public List<ServiceConsumerInfo> getListByConsumerAppId(@Param("consumerAppId")long consumerAppId,@Param("limit")int limit,@Param("offset") int offset);
	
	public long getCountByConsumerAppId(@Param("consumerAppId")long consumerAppId);
	
	
	public List<ServiceConsumerInfo> getListByConsumerHostId(@Param("comsumerHostId")long comsumerHostId,@Param("limit")int limit,@Param("offset") int offset);
	
	public long getCountByConsumerHostId(@Param("comsumerHostId")long comsumerHostId);
	
}