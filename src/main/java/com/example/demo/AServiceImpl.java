package com.example.demo;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class AServiceImpl implements AService {

	@Reference
	private BService bService;

	@Reference
	private CService cService;
}
