package xmu.crms.mapper;

import java.math.BigInteger;

import xmu.crms.entity.User;

public interface UserMapper {

	/**
	 * 微信登录后用户绑定（创建用户）.
	 * <p>User中只有phone和password，userId是注册后才有并且在数据库自增<br>
	 * @param user 用户信息
	 * @author lhl
	 */
	 void insertUser(User user);
	 
	 /**
	 * 登陆用户名和密码检验
	 * <p>手机号登录 (.Net使用),User中只有phone和password，用于判断用户名密码是否正确<br>
	 * @param user 用户信息(手机号Phone和密码Password)
	 * @return user 该用户信息
	 * @author lhl
	 */
	 User getUserByPhoneAndPassword(User user);
		
	 
	 /**
	 * 手机号注册（创建用户）.
	 * <p>手机号注册 (.Net使用),User中只有phone和password，userId是注册后才有并且在数据库自增<br> 
	 * @author lhl
	 * @param user 用户信息(手机号Phone和密码Password)
	 */
	 void insertUserByPhoneAndPassword(User user);
	
	
	 /**
	 * 获得用户信息.
	 * @author lhl
	 * @param user 用户信息(手机号Phone和密码Password)
	 */
	 User getUser(User user);
	 
	 /**
	 * 用户解绑(删除用户).
	 * @author lhl
	 * @param userId 用户id
	 */
	 void deleteUser(BigInteger userId);
}
