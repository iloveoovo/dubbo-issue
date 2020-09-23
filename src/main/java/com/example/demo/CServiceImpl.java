package com.example.demo;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class CServiceImpl implements CService {

	@Reference
	private BService bService;
}
