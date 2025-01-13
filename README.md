--select * from crime_scene_report where date=20180115 
--									and type="murder" and city="SQL City"
--select * from person where address_number=(select max(address_number) from person ) 
--  					and address_street_name="Northwestern Dr" 
--select * from person where name like "%Annabel%" and address_street_name="Franklin Ave"
--select * from interview where person_id=14887
--select * from interview where person_id=16371

--select * from get_fit_now_member  where membership_status="gold"  and id like "48Z%"

--select * from get_fit_now_check_in where check_in_date=20180109

--select id from drivers_license where plate_number like "%H42W%" and gender="male"

--select * from facebook_event_checkin where date=20180115
--select * from facebook_event_checkin where date=20180115 and person_id=664760
--select * from person where license_id=42332
--select * from person where id=664760

--67318
--51739

select * from person
join get_fit_now_member on person.id = get_fit_now_member.person_id
join drivers_license on person.license_id = drivers_license.id
where get_fit_now_member.membership_status="gold"  
and 
get_fit_now_member.id like "48Z%"
and
drivers_license.id in (select id from drivers_license where plate_number like "%H42W%" and gender="male")
