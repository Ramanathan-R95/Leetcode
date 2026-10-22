select S.user_id , 
Case
    when C.user_id is NULL then 0.00
    else round( sum(action = "confirmed") / count(*),2)
end as confirmation_rate from

Signups S left join Confirmations C 
on S.user_id = C.user_id group by S.user_id;
