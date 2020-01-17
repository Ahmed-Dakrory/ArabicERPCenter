/**
 * 
 */
package main.com.crm.security.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import main.com.crm.loginNeeds.user;
import main.com.crm.loginNeeds.userRepository;

/**
 * @author Omnya Alaa
 * 
 */
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	/*
	 * Mock for users from database. In the real application users will be
	 * retrieved from database and proper Spring UserDetails object will be
	 * created then for each database user.
	 */

	/*
	 * @Autowired IUserRepository userRep;
	 */
	
	@Autowired
	userRepository userDataRepository;
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		try {

			user dao = userDataRepository.getByUserName(username);
			System.out.println("AhmedDakrory: "+dao.getEmail());
			UserDetails user;
			if(dao.getRole()==main.com.crm.loginNeeds.user.ROLE_MoneyManager) {
				Collection<GrantedAuthority> studentAuthorities = new ArrayList<GrantedAuthority>();
				studentAuthorities.add(new GrantedAuthorityImpl("ROLE_MoneyManager"));
				user = new User(dao.getUserName(), dao.getPassword(), true,
						true, true, true, studentAuthorities);
			}else if(dao.getRole()==main.com.crm.loginNeeds.user.ROLE_ADMIN) {
				Collection<GrantedAuthority> studentAuthorities = new ArrayList<GrantedAuthority>();
				studentAuthorities.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
				user = new User(dao.getUserName(), dao.getPassword(), true,
						true, true, true, studentAuthorities);
			}else if(dao.getRole()==main.com.crm.loginNeeds.user.ROLE_GeneralManager) {
				Collection<GrantedAuthority> studentAuthorities = new ArrayList<GrantedAuthority>();
				studentAuthorities.add(new GrantedAuthorityImpl("ROLE_GeneralManager"));
				user = new User(dao.getUserName(), dao.getPassword(), true,
						true, true, true, studentAuthorities);
			}else {
				Collection<GrantedAuthority> studentAuthorities = new ArrayList<GrantedAuthority>();
				studentAuthorities.add(new GrantedAuthorityImpl("ROLE_Freelancer"));
				user = new User(dao.getUserName(), dao.getPassword(), true,
						true, true, true, studentAuthorities);
			}
			return user;
		} catch (IndexOutOfBoundsException ex) {
			throw new UsernameNotFoundException("UserAccount for name \""
					+ username + "\" not found.");
		}

		
		
	}

}
