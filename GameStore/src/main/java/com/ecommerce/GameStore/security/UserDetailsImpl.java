package com.ecommerce.GameStore.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ecommerce.GameStore.model.Usuario;


public class UserDetailsImpl implements UserDetails {
	private static final long serialVersionUID = 1L;
	
	private String usuario;
	private String senha;
	private List<GrantedAuthority> authorities;
	
	public UserDetailsImpl(Usuario usuario) { 
		this.usuario = usuario.getUsuario();
		this.senha = usuario.getSenha();
		
	}
	
	public UserDetailsImpl() {
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getSenha() {
		return senha;
	}

	public String getUsuario() {

		return usuario;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
