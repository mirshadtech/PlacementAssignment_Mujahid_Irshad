package in.ineuron.servicefactory;

import in.ineuron.service.BlogServiceImpl;
import in.ineuron.service.IBlogService;

public class ServiceFactory {
	private static IBlogService service;

	private ServiceFactory() {
	}

	public static IBlogService getServiceObject() {
		if (service == null)
			service = new BlogServiceImpl();
		return service;
	}

}
