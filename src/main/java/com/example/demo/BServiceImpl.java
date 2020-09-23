package com.example.demo;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class BServiceImpl implements BService {

	@Reference
	private CService cService;
}
