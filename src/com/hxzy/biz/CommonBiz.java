package com.hxzy.biz;

public interface CommonBiz<T> {
    /**
     * ͨ�õ������ķ���
     */
    int add(T t);

    /**
     * ͨ�õ��޸ķ���
     * @param t
     * @return
     */
    int update(T t);

    /**
     * ����idɾ��
     * @param id
     * @return
     */
    int remove(int id);

    /**
     * ����id��ѯһ������
     * @param id
     * @return
     */
    T queryOne(int id);
}
