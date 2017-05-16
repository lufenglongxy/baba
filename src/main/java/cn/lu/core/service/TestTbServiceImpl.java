package cn.lu.core.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lu.core.bean.TestTb;
import cn.lu.core.dao.TestTbDao;


/**
 * Created by lufenglong on 2017/5/15.
 */
@Service
@Transactional
public class TestTbServiceImpl implements TestTbService {

    @Resource
    private TestTbDao testTbDao;

    @Override
    public void addTestTb(TestTb testTb) {
        testTbDao.addTestTb(testTb);

//        throw new RuntimeException();
    }
}
