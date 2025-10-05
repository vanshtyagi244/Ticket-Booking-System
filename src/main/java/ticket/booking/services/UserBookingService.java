package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticket.booking.entities.User;
import ticket.booking.utils.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import ticket.booking.entities.Ticket;

public class UserBookingService {

    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH = "../localdb/user.json";


    UserBookingService(User user) throws IOException {
        this.user = user;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }

    public Boolean loginUser(){
        Optional<User> foundUser = userList.stream().filter(user1-> user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user1.getPassword(), user.getHashedPassword())).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signupUser(User user) throws IOException {
        userList.add(user);
        saveUserListToFile();
        return Boolean.TRUE;
    }

    private void saveUserListToFile() throws IOException {
        File usersFile = new File(USERS_PATH);
        objectMapper.writeValue(usersFile, userList);
    }

    public void fetchBookings() {
        user.printTickets();
    }

    public void CancelTicket(String ticketId){
        List<Ticket> finalTickets = user.getTicketsBooked().stream().filter((Ticket ticket)-> !ticket.getTicketId().equals(ticketId)).toList();
        user.setTicketsBooked(finalTickets);
    }
}
