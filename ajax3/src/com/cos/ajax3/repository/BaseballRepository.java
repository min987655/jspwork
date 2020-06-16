package com.cos.ajax3.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cos.ajax3.db.DBconn;
import com.cos.ajax3.model.KBOTeam;
import com.cos.ajax3.model.Players;

public class BaseballRepository {
	private static final String TAG = "BaseballRepository : "; 
	
	private static BaseballRepository instance = new BaseballRepository();
	private BaseballRepository() {}
	public static BaseballRepository getInstance() {
		return instance;
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public List<KBOTeam> findAll() {
		final String SQL = "SELECT id, teamName FROM KBOTeam";
		List<KBOTeam> kboTeams = new ArrayList<>();
		
		try {
			conn = DBconn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				KBOTeam kboTeam = new KBOTeam(
								rs.getInt("id"),
								rs.getString("teamName")
				);
				kboTeams.add(kboTeam);
				System.out.println(TAG + "KBOTeam : " + kboTeam);
			}
			return kboTeams;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findAll : " + e.getMessage());
		} finally {
			DBconn.close(conn, pstmt, rs);
		}
		return null;
	}
	
	public List<Players> findTeamPlayer() {
		final String SQL = "SELECT id, playerName FROM players";
		List<Players> playerList = new ArrayList<>();
		
		try {
			conn = DBconn.getConnection();
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				Players player = new Players(
								rs.getInt("id"),
								rs.getInt("teamId"),
								rs.getString("playerName"),
								rs.getString("position")
				);
				playerList.add(player);
				System.out.println(TAG + "KBOTeam : " + player);
			}
			return playerList;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(TAG + "findTeamPlayer : " + e.getMessage());
		} finally {
			DBconn.close(conn, pstmt, rs);
		}
		return null;
	}
}
