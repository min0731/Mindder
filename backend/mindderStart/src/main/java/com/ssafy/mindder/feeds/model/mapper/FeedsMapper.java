package com.ssafy.mindder.feeds.model.mapper;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.mindder.feeds.model.FeedsDto;

@Mapper
public interface FeedsMapper {
	// 피드 작성
	public int writeFeed(FeedsDto feedsDto) throws SQLException;

	// 피드 삭제
	public int deleteMainFeed(int feedIdx) throws SQLException;

	public int deleteFeedLike(int feedIdx) throws SQLException;

	public int deleteFeedComment(int feedIdx) throws SQLException;

	public int deleteFeedScrap(int feedIdx) throws SQLException;

	// 피드 수정
	public int modifyFeed(FeedsDto boardDto) throws SQLException;

	// 추천피드 목록 조회
	public List<FeedsDto> recommendationFeed(FeedsDto boardDto) throws SQLException;

	// 유사감정 태그 피드 조회
	public List<FeedsDto> similarityTagFeed(FeedsDto boardDto) throws SQLException;

	// 유사 감정 색상 태그 피드 조회
	public List<FeedsDto> similarityColorFeed(FeedsDto boardDto) throws SQLException;

	// 사용자 이웃 피드 목록 조회
	public List<FeedsDto> recommendationNeighbors(FeedsDto boardDto) throws SQLException;

	// 피드 상세 조회
	public FeedsDto getFeed(int feedIdx) throws SQLException;

	//////////////////////////////////////////////////////////////////

	// 피드 작성 예시 크롤링

	// 완성된 곰돌이 조회
	// idx 2개 받음 -> DB에서 조회해서 이미지 URL로 보내주면 됨
}
