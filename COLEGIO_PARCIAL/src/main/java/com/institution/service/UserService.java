package com.institution.service;

import co.elastic.clients.elasticsearch.security.User;

public abstract class UserService {
	    abstract User findByUsername(String username);
	}

