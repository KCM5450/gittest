package com.javalec.springMVCBoard.dao;

import java.util.ArrayList;

import com.javalec.springMVCBoard.dto.BDto;

public interface IDao {
	// ���ø��� ������ �������̽� ����� �߿��ϴ�?
	// �߻�޼ҵ� (abstract ����)
	
	
	public ArrayList<BDto> list();
	public int writeBID();
	public void write(int id, final String bName, final String bTitle, final String bContent, int id2);
	public BDto contentView(String strID);
	public void modify(String bId, String bName, String bTitle, String bContent);
	public void delete(String bId);
	public BDto reply_view(String str);
	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, String bStep, String bIndent);
	public void replyShape(int bGroup, int bStep);
	public void upHit(String bId);
	
	
}