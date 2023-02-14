package com.ssafy.mindder.alarms.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.mindder.alarms.model.AlarmListDto;
import com.ssafy.mindder.alarms.model.AlarmsUserDto;
import com.ssafy.mindder.alarms.model.TokenUpdateDto;
import com.ssafy.mindder.alarms.model.mapper.AlarmsMapper;

@Service
public class AlarmsServiceImpl implements AlarmsService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void addToken(TokenUpdateDto tokenUpdateDto) throws Exception {
		sqlSession.getMapper(AlarmsMapper.class).updateToken(tokenUpdateDto);
	}
	
	@Override
	public AlarmsUserDto findDeviceToken(int senderUserIdx, int receiverUserIdx) throws Exception {
		return sqlSession.getMapper(AlarmsMapper.class).selectDeviceToken(senderUserIdx, receiverUserIdx);
	}
	
	@Override
	public void addFollowAlarm(int userIdx, int targetUserIdx, int fileIdx) throws Exception {
		sqlSession.getMapper(AlarmsMapper.class).insertFollowAlarm(userIdx, targetUserIdx, fileIdx);
	}
	
	@Override
	public List<AlarmListDto> findAlarms(int userIdx) throws Exception {
		return sqlSession.getMapper(AlarmsMapper.class).selectAlarms(userIdx);
	}
	
	@Override
	public int findUserFileIdx(int userIdx) throws Exception {
		return sqlSession.getMapper(AlarmsMapper.class).selectUserFileIdx(userIdx);
	}
	
	@Override
	public void modifyAlarm(int alarmIdx) throws Exception {
		sqlSession.getMapper(AlarmsMapper.class).updateAlarm(alarmIdx);
	}
	
	@Override
	public String findAlarm(int alarmIdx) throws Exception {
		return sqlSession.getMapper(AlarmsMapper.class).selectAlarm(alarmIdx);
	}
	
}
