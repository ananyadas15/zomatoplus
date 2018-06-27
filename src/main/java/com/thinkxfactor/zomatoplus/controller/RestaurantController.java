package com.thinkxfactor.zomatoplus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.ItemRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant rest)
	{
		Restaurant persistedRestaurant = restaurantRepository.save(rest);
		return persistedRestaurant;
	}

	
	@GetMapping("/getAll")
	public List<Restaurant> getAll()
	{
		List<Restaurant> listofusers = restaurantRepository.findAll();
		return listofusers;
	}
	
	
	@Autowired
	private ItemRepository itemRepository;
	
	@PostMapping("/addItems")
	public Item addItems(@RequestBody Item items)
	{
		Item persistedItem = itemRepository.save(items);
		return persistedItem;
	}
	
	@GetMapping("/showItems")
	public List<Item> showItems()
	{
		return itemRepository.findAll();
	}
	
	@GetMapping("/getRestaurantByPlace")
	public List<Restaurant> getRestaurant(@RequestParam String city) {
		List<Restaurant> list1 = restaurantRepository.findAllByCity(city);
		return list1;
	}
	
	@GetMapping("/getItemsOfRestaurant")
	public List<Item> getItemsOfRestaurant(@RequestParam String name)
	{
		Restaurant rest = restaurantRepository.findByName(name);
		List<Item> it = itemRepository.findAllByRestaurantId(rest.getId());
		return it;
	}
	
	/*@PostMapping("/create")
	public Restaurant createRestaurant(@RequestBody Restaurant rest)
	{
		System.out.println(rest.toString());
		return rest;
	}
	
	@GetMapping("/getall")
	public List<Restaurant> restList() {
		List<Restaurant> res = new ArrayList<>();
		Restaurant res1,res2,res3,res4;
		res1 = new Restaurant("Arsalan","Mint",4.5,"www.arsalan.com",945320165);
		res2 = new Restaurant("Marco Polo","Park Street",4.8,"www.marcopolo.com",963258410);
		res3 = new Restaurant("Grand Hotel","Esplanade",5,"www.grand.com",962145302);
		res4 = new Restaurant("Peerless Inn","Esplanade",5,"www.peerlessinn.com",954103325);
		res.add(res1);
		res.add(res2);
		res.add(res3);
		res.add(res4);
		return res;
	}
	
	@PostMapping("/items")
	public Item addItems(@RequestBody Item items)
	{
		System.out.println(items.toString());
		return items;
	}*/

}
