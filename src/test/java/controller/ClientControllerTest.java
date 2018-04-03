package controller;

import junit.framework.TestCase;
import model.Client;
import model.Issue;

/**
 * Created by Adrian on 01.04.2018.
 */
public class ClientControllerTest extends TestCase {
    public void testAddClient() throws Exception {
//        assertTrue(true);

        System.out.println("\n ---------------------- Add New Client\n");

        ClientController con = new ClientController();
//        assertEquals(2, con._dataManager.Clients.size());
        Client client = new Client("L", "l1", "12");

        System.out.println(client.Name.equals("L"));
        assert (client.Name.equals("L"));
        System.out.println(client.Address.equals("l1"));
        assert (client.Address.equals("l1"));
        System.out.println(client.idClient.equals("12"));
        assert (client.idClient.equals("12"));
		con.AddClient(client.Name, client.Address, client.idClient);
//		assertEquals(2, con._dataManager.Clients.size());
		System.out.println(client.toString());
    }

    public void testAddClientIndex() throws Exception {

        System.out.println("\n ---------------------- Add New Issue\n");

        ClientController con = new ClientController();
        assertEquals(0, con._dataManager.Issues.size());
        Issue issue = new Issue("5", 2012, 8, 400, 200);

        System.out.println(issue.Client.equals("5"));
        assert (issue.Client.equals("5"));
        System.out.println(issue.Year == 2012);
        assert (issue.Year == 2012);
        System.out.println(issue.Month == 8);
        assert (issue.Month == 8);
        System.out.println(issue.ToPay == 400);
        assert (issue.ToPay == 400);
        System.out.println(issue.Paid == 200);
        assert (issue.Paid == 200);
        con.AddClientIndex(issue.Client, issue.Year, issue.Month, issue.ToPay);
//        assertEquals(0, con._dataManager.Issues.size());
        System.out.println(issue.toString());
    }

    public void testListIssues() throws Exception {

        System.out.println("\n ---------------------- List Issues of Client\n");

        ClientController con = new ClientController();
//        assertEquals(2, con._dataManager.Clients.size());
        Client client = new Client("L", "l1", "12");

        System.out.println(client.Name.equals("L"));
        assert (client.Name.equals("L"));
        System.out.println(client.Address.equals("l1"));
        assert (client.Address.equals("l1"));
        System.out.println(client.idClient.equals("12"));
        assert (client.idClient.equals("12"));
        con.AddClient(client.Name, client.Address, client.idClient);
//		assertEquals(2, con._dataManager.Clients.size());
        System.out.println(client.toString());

        assertEquals(0, con._dataManager.Issues.size());
        Issue issue = new Issue("12", 2012, 8, 400, 200);
        String result = con.ListIssue("12");
        assert (client.Name.equals("L, l1, 12"));
        System.out.println(issue.toString());
    }
}