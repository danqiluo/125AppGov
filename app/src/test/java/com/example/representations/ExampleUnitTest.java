package com.example.representations;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
        String input = "{\n" +
                "    \"status\": \"OK\",\n" +
                "    \"copyright\": \"Copyright (c) 2017 Pro Publica Inc. All Rights Reserved.\",\n" +
                "    \"results\": [{\n" +
                "        \"congress\": 115,\n" +
                "        \"chamber\": \"House\",\n" +
                "        \"num_results\": 20,\n" +
                "        \"offset\": 0,\n" +
                "        \"bills\": [{\n" +
                "                \"bill_id\": \"hr4256-115\",\n" +
                "                \"bill_slug\": \"hr4256\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4256\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4256.json\",\n" +
                "                \"title\": \"To amend the Public Health Service Act to authorize the expansion of activities related to Alzheimer's disease, cognitive decline, and brain health under the Alzheimer's Disease and Healthy Aging Program, and for other purposes.\",\n" +
                "                \"short_title\": \"To amend the Public Health Service Act to authorize the expansion of activities related to Alzheimer's disease, cognitive decline, and brain health under the Alzheimer's Disease and Healthy Aging Program, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"G000558\",\n" +
                "                \"sponsor_name\": \"Brett Guthrie\",\n" +
                "                \"sponsor_state\": \"KY\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/G000558.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4256\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4256\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 3,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 2,\n" +
                "                    \"R\": 1\n" +
                "                },\n" +
                "                \"committees\": \"House Energy and Commerce Committee\",\n" +
                "                \"committee_codes\": [\"HSIF\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Energy and Commerce.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4254-115\",\n" +
                "                \"bill_slug\": \"hr4254\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4254\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4254.json\",\n" +
                "                \"title\": \"To amend the National Science Foundation Authorization Act of 2002 to strengthen the aerospace workforce pipeline by the promotion of Robert Noyce Teacher Scholarship Program and National Aeronautics and Space Administration internship and fellowship opportunities to women, and for other purposes.\",\n" +
                "                \"short_title\": \"To amend the National Science Foundation Authorization Act of 2002 to strengthen the aerospace workforce pipeline by the promotion of Robert Noyce Teacher Scholarship Program and National Aeronautics and Space Administration internship and fellowship oppo\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"K000387\",\n" +
                "                \"sponsor_name\": \"Steve Knight\",\n" +
                "                \"sponsor_state\": \"CA\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/K000387.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4254\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4254\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 3,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 2,\n" +
                "                    \"R\": 1\n" +
                "                },\n" +
                "                \"committees\": \"House Science, Space, and Technology Committee\",\n" +
                "                \"committee_codes\": [\"HSSY\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Science, Space, and Technology.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4260-115\",\n" +
                "                \"bill_slug\": \"hr4260\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4260\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4260.json\",\n" +
                "                \"title\": \"To amend the Internal Revenue Code of 1986 to establish a new tax credit and grant program to stimulate investment and healthy nutrition options in food deserts, and for other purposes.\",\n" +
                "                \"short_title\": \"To amend the Internal Revenue Code of 1986 to establish a new tax credit and grant program to stimulate investment and healthy nutrition options in food deserts, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"R000577\",\n" +
                "                \"sponsor_name\": \"Tim Ryan\",\n" +
                "                \"sponsor_state\": \"OH\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/R000577.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4260\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4260\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 3,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"R\": 1,\n" +
                "                    \"D\": 2\n" +
                "                },\n" +
                "                \"committees\": \"House Agriculture Committee\",\n" +
                "                \"committee_codes\": [\"HSWM\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Referred to the Committee on Ways and Means, and in addition to the Committee on Agriculture, for a period to be subsequently determined by the Speaker, in each case for consideration of such provisions as fall within the jurisdiction of the committee concerned.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4262-115\",\n" +
                "                \"bill_slug\": \"hr4262\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4262\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4262.json\",\n" +
                "                \"title\": \"To authorize members and former members of the uniformed services who are entitled to veterans disability compensation to continue to participate in the Thrift Savings Plan through the deduction and deposit of a percentage of their veterans disability compensation to the Thrift Savings Fund.\",\n" +
                "                \"short_title\": \"To authorize members and former members of the uniformed services who are entitled to veterans disability compensation to continue to participate in the Thrift Savings Plan through the deduction and deposit of a percentage of their veterans disability com\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"W000819\",\n" +
                "                \"sponsor_name\": \"Mark Walker\",\n" +
                "                \"sponsor_state\": \"NC\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/W000819.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4262\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4262\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 0,\n" +
                "                \"cosponsors_by_party\": {},\n" +
                "                \"committees\": \"House Oversight and Government Reform Committee\",\n" +
                "                \"committee_codes\": [\"HSGO\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Oversight and Government Reform.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4259-115\",\n" +
                "                \"bill_slug\": \"hr4259\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4259\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4259.json\",\n" +
                "                \"title\": \"To amend the Public Health Service Act to authorize the Secretary of Health and Human Services to award grants for naloxone rescue kits in public libraries, and for other purposes.\",\n" +
                "                \"short_title\": \"To amend the Public Health Service Act to authorize the Secretary of Health and Human Services to award grants for naloxone rescue kits in public libraries, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"M001185\",\n" +
                "                \"sponsor_name\": \"Sean Patrick Maloney\",\n" +
                "                \"sponsor_state\": \"NY\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/M001185.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4259\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4259\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 0,\n" +
                "                \"cosponsors_by_party\": {},\n" +
                "                \"committees\": \"House Energy and Commerce Committee\",\n" +
                "                \"committee_codes\": [\"HSIF\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Energy and Commerce.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4257-115\",\n" +
                "                \"bill_slug\": \"hr4257\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4257\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4257.json\",\n" +
                "                \"title\": \"To maximize land management efficiencies, promote land conservation, generate education funding, and for other purposes.\",\n" +
                "                \"short_title\": \"To maximize land management efficiencies, promote land conservation, generate education funding, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"S001192\",\n" +
                "                \"sponsor_name\": \"Chris Stewart\",\n" +
                "                \"sponsor_state\": \"UT\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/S001192.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4257\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4257\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 1,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 1\n" +
                "                },\n" +
                "                \"committees\": \"House Natural Resources Committee\",\n" +
                "                \"committee_codes\": [\"HSII\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Natural Resources.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4255-115\",\n" +
                "                \"bill_slug\": \"hr4255\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4255\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4255.json\",\n" +
                "                \"title\": \"To amend the Internal Revenue Code of 1986 to exclude corporations operating prisons from the definition of taxable REIT subsidiary.\",\n" +
                "                \"short_title\": \"To amend the Internal Revenue Code of 1986 to exclude corporations operating prisons from the definition of taxable REIT subsidiary.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"M001137\",\n" +
                "                \"sponsor_name\": \"Gregory W. Meeks\",\n" +
                "                \"sponsor_state\": \"NY\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/M001137.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4255\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4255\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 0,\n" +
                "                \"cosponsors_by_party\": {},\n" +
                "                \"committees\": \"House Ways and Means Committee\",\n" +
                "                \"committee_codes\": [\"HSWM\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"Taxation\",\n" +
                "                \"summary\": \"Ending Tax Breaks for Private Prisons Act  This bill amends the Internal Revenue Code to exclude from the definition of \\\"taxable REIT (Real Estate Investment Trust) subsidiary\\\" any corporation which directly or indirectly: (1) operates or manages a prison facility or provides services at or in connection with a prison facility; or (2) provides to any other person (under a franchise, license, or otherwise) rights to any brand name under which any prison facility is operated, subject to specified exceptions. \",\n" +
                "                \"summary_short\": \"Ending Tax Breaks for Private Prisons Act  This bill amends the Internal Revenue Code to exclude from the definition of &quot;taxable REIT (Real Estate Investment Trust) subsidiary&quot; any corporation which directly or indirectly: (1) operates or manages a prison facility or provides services at or in connection with a prison facility; or (2) provides to any other person (under a franchise, license, or otherwise) rights to any brand name under which any prison facility is operated, subject to specifi...\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Ways and Means.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4261-115\",\n" +
                "                \"bill_slug\": \"hr4261\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4261\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4261.json\",\n" +
                "                \"title\": \"To improve public safety, accountability, transparency, and respect for federalism in Federal criminal law by applying evidence-based reforms already made by some States, and reinvesting the resulting savings from doing so in additional evidence-based criminal justice strategies that are proven to reduce recidivism and crime, and the burden of the criminal justice system on the taxpayer.\",\n" +
                "                \"short_title\": \"To improve public safety, accountability, transparency, and respect for federalism in Federal criminal law by applying evidence-based reforms already made by some States, and reinvesting the resulting savings from doing so in additional evidence-based cri\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"S000185\",\n" +
                "                \"sponsor_name\": \"Robert C. Scott\",\n" +
                "                \"sponsor_state\": \"VA\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/S000185.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4261\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4261\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 7,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"R\": 4,\n" +
                "                    \"D\": 3\n" +
                "                },\n" +
                "                \"committees\": \"House Energy and Commerce Committee\",\n" +
                "                \"committee_codes\": [\"HSJU\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Referred to the Committee on the Judiciary, and in addition to the Committee on Energy and Commerce, for a period to be subsequently determined by the Speaker, in each case for consideration of such provisions as fall within the jurisdiction of the committee concerned.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4258-115\",\n" +
                "                \"bill_slug\": \"hr4258\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4258\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4258.json\",\n" +
                "                \"title\": \"To promote the development of local strategies to coordinate use of assistance under sections 8 and 9 of the United States Housing Act of 1937 with public and private resources, to enable eligible families to achieve economic independence and self-sufficiency, and for other purposes.\",\n" +
                "                \"short_title\": \"To promote the development of local strategies to coordinate use of assistance under sections 8 and 9 of the United States Housing Act of 1937 with public and private resources, to enable eligible families to achieve economic independence and self-suffici\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"D000614\",\n" +
                "                \"sponsor_name\": \"Sean Duffy\",\n" +
                "                \"sponsor_state\": \"WI\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/D000614.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4258\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4258\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 1,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 1\n" +
                "                },\n" +
                "                \"committees\": \"House Financial Services Committee\",\n" +
                "                \"committee_codes\": [\"HSBA\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"Housing and Community Development\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Financial Services.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hres607-115\",\n" +
                "                \"bill_slug\": \"hres607\",\n" +
                "                \"bill_type\": \"hres\",\n" +
                "                \"number\": \"H.RES.607\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hres607.json\",\n" +
                "                \"title\": \"Providing for consideration of the bill (H.R. 3043) to modernize hydropower policy, and for other purposes, and providing for consideration of the bill (H.R. 3441) to clarify the treatment of two or more employers as joint employers under the National Labor Relations Act and the Fair Labor Standards Act of 1938.\",\n" +
                "                \"short_title\": \"Providing for consideration of the bill (H.R. 3043) to modernize hydropower policy, and for other purposes, and providing for consideration of the bill (H.R. 3441) to clarify the treatment of two or more employers as joint employers under the National Lab\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"B001289\",\n" +
                "                \"sponsor_name\": \"Bradley Byrne\",\n" +
                "                \"sponsor_state\": \"AL\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/B001289.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-resolution/607\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hres607\",\n" +
                "                \"introduced_date\": \"2017-11-06\",\n" +
                "                \"active\": true,\n" +
                "                \"last_vote\": \"2017-11-07\",\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 0,\n" +
                "                \"cosponsors_by_party\": {},\n" +
                "                \"committees\": \"House Rules Committee\",\n" +
                "                \"committee_codes\": [\"HSRU\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"Congress\",\n" +
                "                \"summary\": \"Sets forth the rule for consideration of the bill (H.R. 3043) to modernize hydropower policy, and for other purposes, and providing for consideration of the bill (H.R. 3441) to clarify the treatment of two or more employers as joint employers under the National Labor Relations Act and the Fair Labor Standards Act of 1938.\",\n" +
                "                \"summary_short\": \"Sets forth the rule for consideration of the bill (H.R. 3043) to modernize hydropower policy, and for other purposes, and providing for consideration of the bill (H.R. 3441) to clarify the treatment of two or more employers as joint employers under the National Labor Relations Act and the Fair Labor Standards Act of 1938.\",\n" +
                "                \"latest_major_action_date\": \"2017-11-06\",\n" +
                "                \"latest_major_action\": \"Placed on the House Calendar, Calendar No. 98.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4249-115\",\n" +
                "                \"bill_slug\": \"hr4249\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4249\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4249.json\",\n" +
                "                \"title\": \"To provide housing and Medicaid assistance to families affected by a major disaster, and for other purposes.\",\n" +
                "                \"short_title\": \"To provide housing and Medicaid assistance to families affected by a major disaster, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"M001202\",\n" +
                "                \"sponsor_name\": \"Stephanie Murphy\",\n" +
                "                \"sponsor_state\": \"FL\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/M001202.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4249\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4249\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 1,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 1\n" +
                "                },\n" +
                "                \"committees\": \"House Financial Services Committee\",\n" +
                "                \"committee_codes\": [\"HSIF\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the Committee on Energy and Commerce, and in addition to the Committee on Financial Services, for a period to be subsequently determined by the Speaker, in each case for consideration of such provisions as fall within the jurisdiction of the committee concerned.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4252-115\",\n" +
                "                \"bill_slug\": \"hr4252\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4252\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4252.json\",\n" +
                "                \"title\": \"To expand geothermal production, and for other purposes.\",\n" +
                "                \"short_title\": \"To expand geothermal production, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"S001148\",\n" +
                "                \"sponsor_name\": \"Mike Simpson\",\n" +
                "                \"sponsor_state\": \"ID\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/S001148.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4252\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4252\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 1,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 1\n" +
                "                },\n" +
                "                \"committees\": \"House Natural Resources Committee\",\n" +
                "                \"committee_codes\": [\"HSII\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Natural Resources.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4243-115\",\n" +
                "                \"bill_slug\": \"hr4243\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4243\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4243.json\",\n" +
                "                \"title\": \"To establish a commission for the purpose of making recommendations regarding the modernization or realignment of facilities of the Veterans Health Administration, to improve construction and management leases of the Department of Veterans Affairs, to amend and appropriate funds for the Veterans Choice Program, and for other purposes.\",\n" +
                "                \"short_title\": \"To establish a commission for the purpose of making recommendations regarding the modernization or realignment of facilities of the Veterans Health Administration, to improve construction and management leases of the Department of Veterans Affairs, to ame\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"R000582\",\n" +
                "                \"sponsor_name\": \"Phil Roe\",\n" +
                "                \"sponsor_state\": \"TN\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/R000582.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4243\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4243\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 14,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"R\": 14\n" +
                "                },\n" +
                "                \"committees\": \"House Appropriations Committee\",\n" +
                "                \"committee_codes\": [\"HSVR\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the Committee on Veterans' Affairs, and in addition to the Committees on Rules, and Appropriations, for a period to be subsequently determined by the Speaker, in each case for consideration of such provisions as fall within the jurisdiction of the committee concerned.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4251-115\",\n" +
                "                \"bill_slug\": \"hr4251\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4251\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4251.json\",\n" +
                "                \"title\": \"To promote the use of resilient energy systems to rebuild infrastructure following disasters.\",\n" +
                "                \"short_title\": \"To promote the use of resilient energy systems to rebuild infrastructure following disasters.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"S000248\",\n" +
                "                \"sponsor_name\": \"José E. Serrano\",\n" +
                "                \"sponsor_state\": \"NY\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/S000248.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4251\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4251\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 7,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"R\": 1,\n" +
                "                    \"D\": 6\n" +
                "                },\n" +
                "                \"committees\": \"House Science, Space, and Technology Committee\",\n" +
                "                \"committee_codes\": [\"HSPW\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the Committee on Transportation and Infrastructure, and in addition to the Committee on Science, Space, and Technology, for a period to be subsequently determined by the Speaker, in each case for consideration of such provisions as fall within the jurisdiction of the committee concerned.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4250-115\",\n" +
                "                \"bill_slug\": \"hr4250\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4250\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4250.json\",\n" +
                "                \"title\": \"To promote category management principles within the Federal Government, and for other purposes.\",\n" +
                "                \"short_title\": \"To promote category management principles within the Federal Government, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"R000585\",\n" +
                "                \"sponsor_name\": \"Tom Reed\",\n" +
                "                \"sponsor_state\": \"NY\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/R000585.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4250\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4250\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 6,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 6\n" +
                "                },\n" +
                "                \"committees\": \"House Oversight and Government Reform Committee\",\n" +
                "                \"committee_codes\": [\"HSGO\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Oversight and Government Reform.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4253-115\",\n" +
                "                \"bill_slug\": \"hr4253\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4253\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4253.json\",\n" +
                "                \"title\": \"To amend the Immigration and Nationality Act to provide for certain protections for aliens granted temporary protected status or deferred enforced departure, and for other purposes.\",\n" +
                "                \"short_title\": \"To amend the Immigration and Nationality Act to provide for certain protections for aliens granted temporary protected status or deferred enforced departure, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"V000081\",\n" +
                "                \"sponsor_name\": \"Nydia M. Velázquez\",\n" +
                "                \"sponsor_state\": \"NY\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/V000081.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4253\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4253\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 19,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 19\n" +
                "                },\n" +
                "                \"committees\": \"House Judiciary Committee\",\n" +
                "                \"committee_codes\": [\"HSJU\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on the Judiciary.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4240-115\",\n" +
                "                \"bill_slug\": \"hr4240\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4240\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4240.json\",\n" +
                "                \"title\": \"To protect Second Amendment rights, ensure that all individuals who should be prohibited from buying a firearm are listed in the National Instant Criminal Background Check System, and provide a responsible and consistent background check process.\",\n" +
                "                \"short_title\": \"Public Safety and Second Amendment Rights Protection Act of 2017\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"T000460\",\n" +
                "                \"sponsor_name\": \"Mike Thompson\",\n" +
                "                \"sponsor_state\": \"CA\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/T000460.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4240\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4240\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 37,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"R\": 2,\n" +
                "                    \"D\": 35\n" +
                "                },\n" +
                "                \"committees\": \"House Judiciary Committee\",\n" +
                "                \"committee_codes\": [\"HSJU\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"Crime and Law Enforcement\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on the Judiciary.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4241-115\",\n" +
                "                \"bill_slug\": \"hr4241\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4241\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4241.json\",\n" +
                "                \"title\": \"To direct the Secretary of Transportation to carry out a pilot program to improve transportation planning, and for other purposes.\",\n" +
                "                \"short_title\": \"To direct the Secretary of Transportation to carry out a pilot program to improve transportation planning, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"E000293\",\n" +
                "                \"sponsor_name\": \"Elizabeth Esty\",\n" +
                "                \"sponsor_state\": \"CT\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/E000293.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4241\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4241\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 3,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 1,\n" +
                "                    \"R\": 2\n" +
                "                },\n" +
                "                \"committees\": \"House Transportation and Infrastructure Committee\",\n" +
                "                \"committee_codes\": [\"HSPW\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Transportation and Infrastructure.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4246-115\",\n" +
                "                \"bill_slug\": \"hr4246\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4246\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4246.json\",\n" +
                "                \"title\": \"To amend the Mineral Leasing Act to create a buffer in between oil and gas drilling operations and homes, businesses, schools, and other buildings that require special protection, and for other purposes.\",\n" +
                "                \"short_title\": \"To amend the Mineral Leasing Act to create a buffer in between oil and gas drilling operations and homes, businesses, schools, and other buildings that require special protection, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"B001300\",\n" +
                "                \"sponsor_name\": \"Nanette Barragán\",\n" +
                "                \"sponsor_state\": \"CA\",\n" +
                "                \"sponsor_party\": \"D\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/B001300.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4246\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4246\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 8,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"D\": 8\n" +
                "                },\n" +
                "                \"committees\": \"House Natural Resources Committee\",\n" +
                "                \"committee_codes\": [\"HSII\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"Energy\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Natural Resources.\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"bill_id\": \"hr4242-115\",\n" +
                "                \"bill_slug\": \"hr4242\",\n" +
                "                \"bill_type\": \"hr\",\n" +
                "                \"number\": \"H.R.4242\",\n" +
                "                \"bill_uri\": \"https://api.propublica.org/congress/v1/115/bills/hr4242.json\",\n" +
                "                \"title\": \"To amend title 38, United States Code, to establish a permanent VA Care in the Community Program, and for other purposes.\",\n" +
                "                \"short_title\": \"To amend title 38, United States Code, to establish a permanent VA Care in the Community Program, and for other purposes.\",\n" +
                "                \"sponsor_title\": \"Rep.\",\n" +
                "                \"sponsor_id\": \"R000582\",\n" +
                "                \"sponsor_name\": \"Phil Roe\",\n" +
                "                \"sponsor_state\": \"TN\",\n" +
                "                \"sponsor_party\": \"R\",\n" +
                "                \"sponsor_uri\": \"https://api.propublica.org/congress/v1/members/R000582.json\",\n" +
                "                \"gpo_pdf_uri\": null,\n" +
                "                \"congressdotgov_url\": \"https://www.congress.gov/bill/115th-congress/house-bill/4242\",\n" +
                "                \"govtrack_url\": \"https://www.govtrack.us/congress/bills/115/hr4242\",\n" +
                "                \"introduced_date\": \"2017-11-03\",\n" +
                "                \"active\": false,\n" +
                "                \"last_vote\": null,\n" +
                "                \"house_passage\": null,\n" +
                "                \"senate_passage\": null,\n" +
                "                \"enacted\": null,\n" +
                "                \"vetoed\": null,\n" +
                "                \"cosponsors\": 23,\n" +
                "                \"cosponsors_by_party\": {\n" +
                "                    \"R\": 13,\n" +
                "                    \"D\": 10\n" +
                "                },\n" +
                "                \"committees\": \"House Veterans&#39; Affairs Committee\",\n" +
                "                \"committee_codes\": [\"HSVR\"],\n" +
                "                \"subcommittee_codes\": [],\n" +
                "                \"primary_subject\": \"\",\n" +
                "                \"summary\": \"\",\n" +
                "                \"summary_short\": \"\",\n" +
                "                \"latest_major_action_date\": \"2017-11-03\",\n" +
                "                \"latest_major_action\": \"Referred to the House Committee on Veterans' Affairs.\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }]\n" +
                "}";
        BillJSON.getBills(input);
    }

}