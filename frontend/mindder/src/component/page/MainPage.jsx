import React from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";
import Button from "../ui/Button";
import DrawList from "../list/DrawList";

const Wrapper = styled.div`
    padding: 16px;
    width: calc(100% - 32px);
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
`;

const Container = styled.div`
    width: 360px;
    height: 232px;
    max-width: 720px;
    & > * {
        :not(:last-child) {
            margin-bottom: 16px;
        }
    }
    border : 1px solid black;
    background-color:#7767FD;
    border-radius:20px;
`;

// const TodayCanvas =

function MainPage(props) {
    const navigate = useNavigate();

    return (
        <Wrapper>
            <Container>
                <Button
                    title="메인페이지다."
                    onClick={() => {
                        navigate("/main-page");
                    }}
                />
            </Container>
        </Wrapper>
    );
}

export default MainPage;
