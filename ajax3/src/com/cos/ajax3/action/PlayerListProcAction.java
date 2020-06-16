package com.cos.ajax3.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.ajax3.model.Players;
import com.cos.ajax3.repository.BaseballRepository;
import com.cos.ajax3.util.Script;
import com.google.gson.Gson;

public class PlayerListProcAction implements Action {
	private static final String TAG = "PlayerListProcAction : ";
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BufferedReader br = request.getReader();
		StringBuffer sb = new StringBuffer();
		String input = null;
		while ((input = br.readLine()) != null) {
			sb.append(input);
		}
		Gson gson = new Gson();
		
		BaseballRepository baseballRepository =
				BaseballRepository.getInstance();
		
		List<Players> playerList = baseballRepository.findTeamPlayer();
		String playerListJson = gson.toJson(playerList);
		Script.outJson(playerListJson, response);
	}
}
