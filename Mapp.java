package collections;

import java.util.*;
import java.util.Map.Entry;

public class Mapp {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap();
	m.put(101,"pawan");
	m.put(102,"bobby");
	m.put(103,"kondalarao");
	m.put(104,"annapurna");
	System.out.println(m);
	Set<Integer> keys=m.keySet();
	System.out.println(keys);
	Collection<String> value=m.values();
	System.out.println(value);
	for(Integer key:keys)
	{
		System.out.println(key);
	}
	for(String val:value)
	{
		System.out.println(val);
	}
	System.out.println(m.get(101));
	for(Integer key:keys)
	{
		System.out.println(key+">>>>>"+m.get(key));
	}
	System.out.println(m.containsKey(101));
	System.out.println(m.containsValue("pawan"));
	m.putIfAbsent(105,"eidiko");
	System.out.println(m);
	Set<Entry<Integer,String>> ss=m.entrySet();
	for(Entry<Integer,String> entry:ss)
	{
		Integer i=entry.getKey();
		String s=entry.getValue();
	}
	m.remove(105);
	System.out.println(m);
	m.putIfAbsent(105, null);
	System.out.println(m);
	
}
}
