package com.Attence.dao;

import java.util.List;

import com.Attence.entity.ATTENCE;

public interface ATTENCEdao {

	/**
	 * ��ѯ
	 * @return ��ѯ���
	 */
	
	public List<ATTENCE> getShow();
	
	/**
	 * ��ӿ���
	 * @param attence ��һ��ʵ����
	 * @return ��ӽ��
	 */
	
	public int getadd(ATTENCE attence);
	
	/**
	 * �޸Ŀ���
	 * @param attence ��һ��ʵ����
	 * @return �޸Ľ��
	 */
	
	public int getmodification(ATTENCE attence);
	
	/**
	 * ɾ������
	 * @param ID ��һ��ID
	 * @return ɾ�����
	 */
	
	public int delete(int ID);
	
	/**
	 * ��һid�޸�
	 * @param ID ��һ��id
	 * @return  �޸Ľ��
	 */
	
	public ATTENCE transfer(int ID);
}
