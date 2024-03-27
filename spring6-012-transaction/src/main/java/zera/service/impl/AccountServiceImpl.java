package zera.service.impl;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zera.mapper.AccountMapper;
import zera.pojo.Account;
import zera.service.AccountService;

import java.util.List;

@Transactional
@Service("accountService")
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int save(Account act) {
        return accountMapper.insert(act);
    }

    @Override
    public int deleteByActno(String actno) {

        return accountMapper.deleteByActno(actno);
    }

    @Override
    public int update(Account act) {

        return accountMapper.update(act);
    }

    @Override
    public Account getByActno(String actno) {
        return accountMapper.selectByActno(actno);
    }

    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void transfer(String fromActno, String toActno, double money) {
        Account fromAct = accountMapper.selectByActno(fromActno);
        if(fromAct.getBalance() < money){
            throw new RuntimeException("Money not enough");
        }
        Account toAct = accountMapper.selectByActno(toActno);
        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);
        int count = accountMapper.update(fromAct);
        count+=accountMapper.update(toAct);

        if(count != 2){
            throw new RuntimeException("转账失败");
        }
    }
}
