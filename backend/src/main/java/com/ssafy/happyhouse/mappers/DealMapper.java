package com.ssafy.happyhouse.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.deal.dto.DealDTO;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DealMapper {
	public List<DealDTO> selectDeals(String dong) throws Exception;
	public List<DealDTO> selectAllDeals() throws Exception;
	public List<DealDTO> selectBookmarkDeal(String userId) throws Exception;
	public List<DealDTO> selectTopAptByDong(@Param("dong")String dong) throws Exception;
}
