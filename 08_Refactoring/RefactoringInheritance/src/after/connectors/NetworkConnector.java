package after.connectors;

public class NetworkConnector implements IConnectable {

	@Override
	public void open() {
		// start session on server

	}

	@Override
	public void close() {
		// stop session on server

	}

	@Override
	public String fetch(String query) {
		// create and send a query request (GET, POST with body or URL parameters)
		return null;
	}

}
